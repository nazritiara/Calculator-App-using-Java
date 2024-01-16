/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Expression {
    public int numb1,numb2,result;
    public String operator;
    
    public Expression(){}
    
    public Expression(int numb1,int numb2,int result,String operator)
    {
        this.numb1 = numb1;
        this.numb2 = numb2;
        this.result = result;
        this.operator = operator;
    }
    
    public int getNumb1()
    {
        return numb1;
    }
    public int getNumb2()
    {
        return numb2;
    }
    public int getResult()
    {
        return result;
    }
    public String getOperator()
    {
        return operator;
    }
}
