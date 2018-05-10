package com.leeorz.testlotterytrend;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.leeorz.lotterytrend.model.ICellList;
import com.leeorz.lotterytrend.widget.TableHeaderBean;
import com.leeorz.lotterytrend.widget.TrendTableView;

import java.util.ArrayList;
import java.util.List;

/**
 * author: leeorz
 * email:378229364@qq.com
 * created on: 2018/5/10 下午6:30
 * description:
 */
public class TestTrendActivity extends Activity {

    private TrendTableView trendTableView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_trend);

        trendTableView = (TrendTableView) findViewById(R.id.trendTableView);

        List<TableHeaderBean> tableHeaderBeanList = new ArrayList();
        tableHeaderBeanList.add(new TableHeaderBean("开奖号码",90));

        tableHeaderBeanList.add(new TableHeaderBean("奇偶形态",60));
        tableHeaderBeanList.add(new TableHeaderBean("奇奇奇",60));
        tableHeaderBeanList.add(new TableHeaderBean("奇奇偶",60));
        tableHeaderBeanList.add(new TableHeaderBean("奇偶偶",60));
        tableHeaderBeanList.add(new TableHeaderBean("偶奇偶",60));
        tableHeaderBeanList.add(new TableHeaderBean("奇偶奇",60));
        tableHeaderBeanList.add(new TableHeaderBean("偶奇奇",60));
        tableHeaderBeanList.add(new TableHeaderBean("偶偶奇",60));
        tableHeaderBeanList.add(new TableHeaderBean("偶偶偶",60));

        tableHeaderBeanList.add(new TableHeaderBean("大小形态",60));
        tableHeaderBeanList.add(new TableHeaderBean("大大大",60));
        tableHeaderBeanList.add(new TableHeaderBean("大大小",60));
        tableHeaderBeanList.add(new TableHeaderBean("大小大",60));
        tableHeaderBeanList.add(new TableHeaderBean("大小小",60));
        tableHeaderBeanList.add(new TableHeaderBean("大小大",60));
        tableHeaderBeanList.add(new TableHeaderBean("小大大",60));
        tableHeaderBeanList.add(new TableHeaderBean("小大小",60));
        tableHeaderBeanList.add(new TableHeaderBean("小小大",60));
        tableHeaderBeanList.add(new TableHeaderBean("小小小",60));


        List<String> leftSideList = new ArrayList();
        List<Quick3Bean> testData = new ArrayList();
        testData.add(new Quick3Bean(this,"100123","1,1,5"));
        testData.add(new Quick3Bean(this,"100123","1,2,3"));
        testData.add(new Quick3Bean(this,"100123","2,3,5"));
        testData.add(new Quick3Bean(this,"100123","2,4,6"));
        testData.add(new Quick3Bean(this,"100123","1,2,4"));
        testData.add(new Quick3Bean(this,"100123","2,5,6"));
        testData.add(new Quick3Bean(this,"100123","2,3,4"));
        testData.add(new Quick3Bean(this,"100123","2,2,6"));
        testData.add(new Quick3Bean(this,"100123","2,4,6"));
        testData.add(new Quick3Bean(this,"100123","2,3,4"));
        testData.add(new Quick3Bean(this,"100123","2,3,6"));
        testData.add(new Quick3Bean(this,"100123","1,4,5"));
        testData.add(new Quick3Bean(this,"100123","2,3,6"));
        testData.add(new Quick3Bean(this,"100123","3,4,6"));
        testData.add(new Quick3Bean(this,"100123","2,4,6"));
        testData.add(new Quick3Bean(this,"100123","3,4,5"));
        testData.add(new Quick3Bean(this,"100123","1,4,6"));
        testData.add(new Quick3Bean(this,"100123","2,4,6"));
        testData.add(new Quick3Bean(this,"100123","2,4,6"));
        testData.add(new Quick3Bean(this,"100123","1,2,3"));
        testData.add(new Quick3Bean(this,"100123","1,4,6"));
        testData.add(new Quick3Bean(this,"100123","2,3,5"));
        testData.add(new Quick3Bean(this,"100123","2,3,6"));
        testData.add(new Quick3Bean(this,"100123","2,5,6"));
        testData.add(new Quick3Bean(this,"100123","2,5,6"));
        testData.add(new Quick3Bean(this,"100123","3,4,5"));
        testData.add(new Quick3Bean(this,"100123","2,4,6"));
        testData.add(new Quick3Bean(this,"100123","1,1,2"));
        testData.add(new Quick3Bean(this,"100123","2,3,6"));
        testData.add(new Quick3Bean(this,"100123","2,5,6"));
        testData.add(new Quick3Bean(this,"100123","1,2,6"));
        testData.add(new Quick3Bean(this,"100123","2,4,6"));
        testData.add(new Quick3Bean(this,"100123","1,3,4"));
        testData.add(new Quick3Bean(this,"100123","2,4,6"));
        testData.add(new Quick3Bean(this,"100123","2,2,5"));
        testData.add(new Quick3Bean(this,"100123","2,3,6"));
        testData.add(new Quick3Bean(this,"100123","2,4,6"));
        testData.add(new Quick3Bean(this,"100123","1,3,6"));
        testData.add(new Quick3Bean(this,"100123","2,3,4"));
        testData.add(new Quick3Bean(this,"100123","4,5,6"));
        testData.add(new Quick3Bean(this,"100123","2,4,6"));
        testData.add(new Quick3Bean(this,"100123","1,2,3"));


        List<ICellList> cellLists = new ArrayList();
        for(Quick3Bean bean:testData){
            leftSideList.add(bean.getId());
            cellLists.add(bean);
        }

        trendTableView.bindTableHeaderData(tableHeaderBeanList);
        trendTableView.bindTableLeftSideData("期号",leftSideList);
        trendTableView.bindTableData(cellLists);

    }
}
