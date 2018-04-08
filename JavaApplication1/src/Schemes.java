/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Schemes {
    private String i,n,p,d;
    public Schemes(String id,String name,String per,String des)
    {
        this.i=id;
        this.n=name;
        this.p=per;
        this.d=des;
    }
    public String getid()
    {
        return i;
    }
    public String getname()
    {
        return n;
    }
    public String getpercentage()
    {
        return p;
    }
    public String getdes()
    {
        return d;
    }
}
