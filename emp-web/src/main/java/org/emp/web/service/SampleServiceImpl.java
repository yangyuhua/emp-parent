package org.emp.web.service;

import org.emp.web.dao.SampleDao;
import org.emp.web.model.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    SampleDao sampleDao;


    @Override
    public Sample findSampleByfId(Long id) {
        return sampleDao.findOne(id);
    }

    @Override
    public List<Sample> findSamplesByName(String name) {
        return sampleDao.findSamplesByName(name);
    }
}
