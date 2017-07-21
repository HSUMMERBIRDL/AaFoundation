package com.hl.sample;

import com.hl.sample.contract.MainContract;
import com.hl.sample.vo.PeopleVo;

import rx.Observable;

/**
 * des:
 * Created by HL
 * on 2017-07-21.
 */

public class MainModel implements MainContract.Model{


    @Override
    public Observable<PeopleVo> getPerson(int id) {

        return null;
    }
}
