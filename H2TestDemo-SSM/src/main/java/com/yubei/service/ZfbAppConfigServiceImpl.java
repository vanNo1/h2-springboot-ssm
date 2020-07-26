
package com.yubei.service;


import com.yubei.bean.ZfbAppConfig;
import com.yubei.dao.ZfbAppConfigMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ZfbAppConfigServiceImpl implements ZfbAppConfigService {



    @Autowired
    private ZfbAppConfigMapper zfbAppConfigMapper;



    public int insert(ZfbAppConfig zfbAppConfig) {
        return zfbAppConfigMapper.insert(zfbAppConfig);

    }


    public ZfbAppConfig getAppConfigByAppCofigId(Long appConfigId) {
        return zfbAppConfigMapper.selectConfigByAppId(appConfigId);
    }
}