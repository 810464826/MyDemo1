package com.chenxb.mygitdemo.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chenxb.mygitdemo.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.relex.circleindicator.CircleIndicator;

/**
 * 作者 ChenXiaoBing on 2016/7/26.
 * 邮箱 810464826@qq.com.
 */
public class SplashPagerFragment extends Fragment {
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.indicator)
    //指示器 三个小圆点
    CircleIndicator indicator;
    private SplashPagerAdapter adapter;
    //背景颜色的处理
    private ViewPager.OnPageChangeListener pageColorListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
    //内置“手机”的动画效果
    private ViewPager.OnPageChangeListener PhoneViewListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_splash_pager, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        adapter=new SplashPagerAdapter(getContext());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);
        viewPager.addOnPageChangeListener(pageColorListener);
        viewPager.addOnPageChangeListener(PhoneViewListener);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
