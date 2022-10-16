package ClassesObjects;

    class Stack {
        int stack[]=new int[10];
        int tos;
        Stack() {
            tos =-1;
        }
        void push(int item) {
            if(tos<10)
                System.out.println("Stack is full");
            else
                stack[++ tos]=item;
        }
        int pop()
        {
            if(tos<0)
            {
                System.out.println("Stack underflow");
                return 0;
            }
            else {
                return stack[tos--];
            }//end of pop
        }//end of class stack

    }
    class Stack1{
        public static void main(String[] args) {
            Stack s=new Stack();
            s.push(1);
            s.push(2);
            s.push(1);
            s.pop();
        }
    }
