package org.emp.web.dao;

import org.emp.web.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
public interface SampleDao extends JpaRepository<Sample, Long>, JpaSpecificationExecutor<Sample> {

    /**
     * 通过name查找sample
     *
     * @param name
     * @return
     */
    List<Sample> findSamplesByName(String name);
}
