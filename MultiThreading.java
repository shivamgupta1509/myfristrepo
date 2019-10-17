class ThreadsJobs implements Runnable
{
	Thread t=null;
	
	ThreadJobs(String name)
	{
			t= new ThreadJobs(String name)
			{
				t=new Thread(this, name);
				t.start();
			}
			public void run()
			{
				long startTime = System.currentTimeMillis();
				
				if(t.getName().equals("Prime"))
				{
					System.out.println("prime Thread Running ....");
					
					int no=2,flag;
					int count=20;
					while(count>0)
					{
						for(int i=2, i<=no/2,i++)
						{
							if(no%i==0)
							{
								flag=0;
								break;
							}
						}
						try
						{
							Thread.currentThread().sleep(500);
						}
						catch(InterruptedException ie)
						{
						}
						if(flag!=0)
						{
							system.out.println("Prime Thread: "+no);
							count--;
						}
						no++;
					}
				}
				else
				{
					System.out.println("Fibonacci Thread: "+f3);
					int f1=0,f2=1,f3;
					for(int i=0;i<=20;i++)
					{
						f3=f1+f2;
						System.out.println("Fibonacci Thread: "+f3);
						f1=f2;
						f2=f3;
						try
						{
							Thread.currentThread().sleep(500);
						}
						catch(InterruptedException ie)
						{
						}
					}
				}
				long endTime = System.currentTimeMillis();
				System.out.println("That took" +(endTime-startTime)+"milliseconds");
			}
	}
	
	class MultiThreading
	{
		public static void main(String args[])
		{
			ThreadJobs t1=new Threadjobs("prime");
			ThreadJobs t2=new ThreadJobs("fibonacci");
		}
	}