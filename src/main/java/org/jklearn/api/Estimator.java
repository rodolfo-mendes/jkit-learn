package org.jklearn.api;

import java.util.Map;

public interface Estimator {
    void fit(double[][] X);
    void fit(double[][] X, double[] y);
    void fit(double[][] X, double[] y, double sampleWeight);

    Map<String,Object> getParams();
    Map<String,Object> getParams(boolean deep);

    void setParams(Map<String,Object> params);
}
