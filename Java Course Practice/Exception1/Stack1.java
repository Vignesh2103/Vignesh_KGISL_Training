package Exception1;


class Stack1
{
    private static int size=0;
    private  int top=-1;
    private int S[];
    
    public Stack1(int size)
    {
        Stack1.size=size;
        S=new int[size];
    }
    
    public void push(int x) throws StackOverFlow
    {
        if(top==size-1)
            throw new StackOverFlow();
        top++;
        S[top]=x;
    }
    
    public int pop() throws StackUnderFlow
    {
        int x=-1;
        
        if(top==-1)
            throw new StackUnderFlow();
        x=S[top];
        top--;
        return x;              
    }
}
