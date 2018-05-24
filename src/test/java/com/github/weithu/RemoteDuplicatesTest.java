package com.github.weithu;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;


public class RemoteDuplicatesTest {
    private RemoveDuplicates rp;
    @Before
    public void setUp(){
        rp = new RemoveDuplicates();
    }
    @Test
    public void errorCase_NullTest(){
        Assert.assertEquals(rp.removeDups(null), null);
    }
    @Test
    public void errorCase_EmptyTest(){
        Assert.assertEquals(rp.removeDups(""), "");
    }
    @Test
    public void exampleTest(){
        Assert.assertEquals(rp.removeDups("AbraCadABraAlakAzam"), "AbrCdlkzm");
    }
    @Test
    public void upperCaseOnlyTest(){
        Assert.assertEquals(rp.removeDups("ABCDEDBCA"), "ABCDE");
    }
    @Test
    public void upperAndLowerCaseTest(){
        Assert.assertEquals(rp.removeDups("AbCdEdBca"), "AbCdE");
    }
    @Test
    public void NoRemovalTest(){
        Assert.assertEquals(rp.removeDups("AbCdEfg"), "AbCdEfg");
    }
    @Test
    public void SingleLetterTest(){
        Assert.assertEquals(rp.removeDups("AAAAAAAA"), "A");
    }
}
