package ClassesObjects;

    import java.util.Scanner;

    class Person{
        int age;
        String name,address;
        float height;
        public Person(String name,String address,int age,float height)
        {
            this.name=name;
            this.address=address;
            this.age=age;
            this.height=height;
        }
    }

    public class Age{
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            Person[]p=new Person[3];
            int i;
            for(i=0;i<3;i++) {
                System.out.println("Enter name=");
                String name=sc.next();
                System.out.println("Enter adress=");
                String address=sc.next();
                System.out.println("Enter age=");
                int age=sc.nextInt();
                System.out.println("Enter height=");
                float height=sc.nextFloat();
                p[i] = new Person(name,address,age,height);

            }
            int g=p[0].age;
            for(i=0;i<3;i++)
            {
//				for(int j=0;j<p.length-1;j++)
//				{

//					if(p[i].age>p[i+1].age)
//					{
//						Age a=p[i];
//						p[i]=p[i+1];
//						p[i+1]=a;
//					}
//				}
                if(p[i].age>g)
                {
                    g=p[i].age;
                }
            }
            for(i=0;i<3;i++)
            {
                if(p[i].age==g)
                {
                    System.out.println(p[i].age+"\n"+p[i].name+"\n"+p[i].address+"\n"+p[i].height);
                }
            }

        }
    }
