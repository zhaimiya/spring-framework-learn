package vi.com.bean.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspectJ {
	// execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)
	// 1.方法的可见性eg:public，private
	//2.返回值类型
	//3.方法所在类的全路径名
	//4.方法名类型
	//5.方法的参数类型
	//6.方法抛出的异常类型
	@Pointcut("execution(* vi.com.bean.aotutag.User getId(..))")
	public  void myPointCut(){

	}


	@Before("execution(* *.getId(..))")
	public  void before(){
		System.out.println("before");
	}

	@After("execution(* *.getId(..))")
	public  void after(){
		System.out.println("after");
	}


    @Around("execution(* *.getId(..))")
    public  void around(ProceedingJoinPoint p){
        System.out.println("around1");
        Object a = null;
        try {
            a = p.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("around2");
    }



}
