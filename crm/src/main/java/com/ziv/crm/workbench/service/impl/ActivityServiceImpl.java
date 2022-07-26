package com.ziv.crm.workbench.service.impl;

import com.ziv.crm.workbench.domain.Activity;
import com.ziv.crm.workbench.mapper.ActivityMapper;
import com.ziv.crm.workbench.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public int saveCreateActivity(Activity activity) {
        return activityMapper.insertActivity(activity);
    }
}
