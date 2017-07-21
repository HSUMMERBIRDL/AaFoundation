package com.hl.sample;

import com.hl.foundation.library.rx.RxSubscriber;
import com.hl.sample.contract.MainContract;
import com.hl.sample.vo.PeopleVo;

/**
 * des:
 * Created by HL
 * on 2017-07-21.
 */

public class MainPresenter extends MainContract.Presenter {


    @Override
    public void sendGetPerson(int peopleId) {

        mRxManager.add(mModel.getPerson(peopleId).subscribe(new RxSubscriber<PeopleVo>() {
            @Override
            protected void _onNext(PeopleVo peopleVo) {

                if(null != mView){
                    mView.onGetPersonComplete(peopleVo);
                }
            }
        }));

    }

}
