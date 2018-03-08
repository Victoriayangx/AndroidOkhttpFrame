package com.polysoft.testaupu.listener;


import com.orhanobut.logger.Logger;
import com.polysoft.testaupu.application.TestApplication;
import com.polysoft.testaupu.base.BaseBean;
import com.polysoft.testaupu.base.BaseModel;
import com.polysoft.testaupu.net.OKHttpManager;

import org.json.JSONObject;

public class LoadFinishBackListenerImpl<T extends BaseBean> implements OKHttpManager.LoadFinishCallBackListener<T> {
    @Override
    public void onFinish(T result) {
        if (result == null ) {
            return;
        }
        if (result.errorCode!=0) {
            return;
        }
        if (result.errorCode==401 || result.errorCode==402) {
            //Token 过期重新获取Token
        }

    }

    @Override
    public void onFailure(String errorCode) {

    }
}
