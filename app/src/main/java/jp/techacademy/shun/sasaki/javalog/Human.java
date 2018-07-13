package jp.techacademy.shun.sasaki.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {

   // String hobby = "今日のお昼ご飯";

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }

}
