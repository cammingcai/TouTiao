package com.chaychan.news.ui.fragment;

import android.view.View;

import com.chaychan.news.R;
import com.chaychan.news.base.BaseFragment;
import com.chaychan.news.base.BasePresenter;
import com.socks.library.KLog;

/**
 * @author ChayChan
 * @description: 微头条fragment
 * @date 2017/6/12  21:47
 */

public class MicroFragment extends BaseFragment{

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int provideContentViewId() {
        return  R.layout.fragment_micro;
    }

    @Override
    public void initView(View rootView) {
        KLog.i("initView");
    }

    @Override
    public void initData() {
        KLog.i("initData");
    }

    @Override
    public void initListener() {
        KLog.i("initListener");
    }

    @Override
    public void loadData() {
        KLog.i("loadData");
    }
}
