/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
class User {
    private String n,d,s,p,t;
    public User(String na,String de,String sa,String pr,String ty)
    {
        this.n=na;
        this.d=de;
        this.s=sa;
        this.p=pr;
        this.t=ty;
    }
    public String getname(){
        return n;
    }
    public String getDescription(){
        return d;
    }
    public String getStatus(){
        return s;
    }
    public String getPriority(){
        return p;
    }
    public String getType(){
        return t;
    }
}
