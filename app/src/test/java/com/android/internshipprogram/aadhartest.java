package com.android.internshipprogram;

import static com.google.common.truth.Truth.assertThat;
public class aadhartest {

    public String[] aadhar;

    public aadhartest() {
        this.aadhar = new String[]{"1234","1234","1234"};
    }
   
    public void checking_that_every_container_have_4_digit(){
        boolean result=aadharUtil.condition(aadhar);
        assertThat(result).isTrue();
    }

    public void checking_that_every_container_have_only_numbers(){
        boolean result=aadharUtil.condition(aadhar);
        assertThat(result).isTrue();
    }

    public void their_is_12digit(){
        boolean result=aadharUtil.condition(aadhar);
        assertThat(result).isTrue();
    }

}