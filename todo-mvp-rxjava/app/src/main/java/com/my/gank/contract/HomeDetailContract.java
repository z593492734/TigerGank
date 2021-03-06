package com.my.gank.contract;

import com.my.gank.base.BaseView;
import com.my.gank.bean.HomeDetailItemBean;

/**
 * Author：mengyuan
 * Date  : 2017/8/15上午11:04
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public interface HomeDetailContract {

    interface View extends BaseView {
        void getDataSuccess(HomeDetailItemBean data);

        void getDataFailed(String message);


    }

    interface Presenter {
        void requestDetail(String date);

    }

}
