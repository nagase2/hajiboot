package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController //このクラスがコントローラクラスになることを示す
@EnableAutoConfiguration //これにより、様々な設定（？）が自動的に有効になり、従来のSpringで必要んだった設定ファイル郡が不要になるらしい
public class App 
{
	@RequestMapping("/") //左のパスでアクセスが有った時に、このメソッドが呼ばれる
	String home(){
		return "Hellっっｋo ssssssdxxxxdっっｘdoos!";
	}
	@RequestMapping("/nagase")
	String myHome(){
		return "Showa-ku";
	}
	
    public static void main( String[] args )
    {
    	//第一引数には、＠EnableAutoConfigurationアノテーションを付けたクラスを指定する。
    	SpringApplication.run(App.class, args);
    }
}
