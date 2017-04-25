package org.emp.web.converter;

import org.emp.web.model.Sample;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by Administrator on 2017/4/5.
 */
public class SampleConverter implements Converter<String, Sample> {

    public Sample convert(String str) {
        Sample sample = null;
        //字符串格式
        if (str != null) {
            sample = new Sample();
            String[] arr = str.split("-");
            sample.setName(arr[0]);
            sample.setEmail(arr[1]);
        }
        return sample;
    }
}
