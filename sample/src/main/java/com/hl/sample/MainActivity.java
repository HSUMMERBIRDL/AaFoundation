package com.hl.sample;

import com.hl.foundation.frame.ui.base.BaseActivity;
import com.hl.sample.contract.MainContract;
import com.hl.sample.vo.PeopleVo;

public class MainActivity extends BaseActivity<MainModel,MainPresenter> implements MainContract.View{

    @Override
    protected void initDatas() {

        mPresenter.sendGetPerson(34);
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initEvents() {

    }

    @Override
    public void onGetPersonComplete(PeopleVo peopleVo) {

    }
}
