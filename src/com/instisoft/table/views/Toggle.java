package com.instisoft.table.views;

public class Toggle
{
    Boolean val;

    public Toggle(Boolean val){
        this.val = val;
    }

    public void setVal(Boolean val){
        this.val = val;
    }

    public Boolean getVal(){
        return val;
    }

    public void toggle(){
        setVal(!getVal());
    }
    
}