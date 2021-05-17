package com.android.internshipprogram;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
public class aadhartest {

    public String[] aadhar;

    public aadhartest() {
        this.aadhar = new String[]{"1234","1234","1234"};
    }
    /* Checking that their is 12 digit or not */
    @Test
    public void checking_that_every_container_have_4_digit(){
        boolean result=aadharUtil.condition(aadhar);
        assertThat(result).isTrue();
    }
    /* Checking that their is not any special character or alphabets (Negative testing) */
    @Test
    public void checking_that_every_container_have_only_numbers(){
        boolean result=aadharUtil.condition(aadhar);
        assertThat(result).isTrue();
    }
    /* (Positive testing) */
    @Test
    public void their_is_12digit(){
        boolean result=aadharUtil.condition(aadhar);
        assertThat(result).isTrue();
    }

}