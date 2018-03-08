package com.polysoft.testaupu.model;

import com.polysoft.testaupu.base.BaseActivity;
import com.polysoft.testaupu.base.BaseModel;
import com.polysoft.testaupu.bean.LoginBean;
import com.polysoft.testaupu.config.HTTPConstant;
import com.polysoft.testaupu.net.OKHttpManager;
import com.polysoft.testaupu.utils.PhoneUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.LinkedHashMap;


public class LoginActivityModel extends BaseModel {



    public void login(BaseActivity context, String username, String password, OKHttpManager.LoadFinishCallBackListener l){

//        LinkedHashMap<String,String> params = new LinkedHashMap<>();
//        params.put("loginName",username);
//        params.put("password",password);
//        params.put("apptype","ANDROID");
//        params.put("nowVersion", PhoneUtil.getVersionName(context));


        try {
            JSONObject params = new JSONObject();
            params.put("loginName",username);
            params.put("password",password);
            params.put("apptype","ANDROID");
            params.put("nowVersion", PhoneUtil.getVersionName(context));
            String paramsStr = params.toString();
            OKHttpManager.getInstance().postJsonAsync(HTTPConstant.LOGIN, paramsStr, LoginBean.class, l);

        } catch (JSONException e) {
            e.printStackTrace();
        }






    }
}
