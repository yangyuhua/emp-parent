package org.emp.web.service;

import org.emp.web.model.Sample;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
public interface SampleService {

    /**
     * 通过id查找Sample
     *
     * @param id
     * @return
     */
    Sample findSampleByfId(Long id);

    /**
     * 通过name查找sample
     *
     * @param name
     * @return
     */
    List<Sample> findSamplesByName(String name);
}
