package com.my.gank.model;

import com.my.gank.Constant;
import com.my.gank.bean.HomeAllBean;
import com.my.gank.contract.HomeContract;
import com.my.gank.request.RequestManager;

/**
 * Author：mengyuan
 * Date  : 2017/8/15上午11:10
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class HomeModel implements HomeContract.Model {
    @Override
    public void requestHistoryList(int pageIndex, RequestManager.MyRequestCallback<HomeAllBean> callback) {
        String url = Constant.URL.HISTORY_LIST + pageIndex;
        RequestManager.getInstance().getAsync(url, callback);
    }
}
