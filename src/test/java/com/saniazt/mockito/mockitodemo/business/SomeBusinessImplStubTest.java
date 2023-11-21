package com.saniazt.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData_basicScenario(){
        DataService dataServiceStub = new DataServiceStub();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceStub);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals (25,result);
    }
    @Test
    void findTheGreatestFromAllData_oneValue(){
        DataService dataServiceStub = new DataServiceStub2();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceStub);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals (35,result);
    }
}
class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int [] {25,15,5};
    }
}

class DataServiceStub2 implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int [] {35};
    }
}
