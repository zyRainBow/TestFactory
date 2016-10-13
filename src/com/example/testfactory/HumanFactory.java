package com.example.testfactory;

import java.util.List;
import java.util.Random;

import android.util.Log;

public class HumanFactory {
	public static IHuman createHuman(Class c){
		IHuman human = null;
		
		try {
			human = (IHuman)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {	//颜色有问题
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {	//人种定义有误
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {	//人种没有定义
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return human;
	}
	
	public static IHuman createHuman(){
		IHuman human = null;
		
		List<Class> concreteHumanList =
				ClassUtils.getAllClassByInterface(IHuman.class); //定义了多少人种
		Log.i("List", concreteHumanList+"");
		
				//八卦炉自己开始想烧出什么人就什么人
				Random random = new Random();
//				if(concreteHumanList.size()==0){
//					return null;
//				}
				int rand = random.nextInt(2);
				human = createHuman(concreteHumanList.get(rand));
		
		return human;
	}
}
