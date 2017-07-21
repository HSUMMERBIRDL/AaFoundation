package com.hl.sample.contract;


import com.hl.foundation.frame.ui.BaseModel;
import com.hl.foundation.frame.ui.BasePresenter;
import com.hl.foundation.frame.ui.BaseView;
import com.hl.sample.vo.PeopleVo;

import rx.Observable;

/**
 * des:
 * Created by HL
 * on 2017-05-02.
 */

public interface MainContract {

    interface Model extends BaseModel {

        Observable<PeopleVo>  getPerson(int id);
    }

    interface View extends BaseView {

        void onGetPersonComplete(PeopleVo peopleVo);
    }

    abstract class Presenter extends BasePresenter<Model, View> {

        public abstract void sendGetPerson(int id);
    }
}
