package org.example.dubbo.api.job;

import com.example.common.model.RequestContext;

/**
 * @author youxuehu
 * @version v1.0
 * @className ClusterService
 * @date 2021/7/18 10:20 上午
 * @desrription 这是类的描述信息
 */
public interface JobControlService {

    String submit(RequestContext requestContext, String cmd);
}
