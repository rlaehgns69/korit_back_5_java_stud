package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData<>(200, "김도훈");
//        send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("김도훈", "01064357321"));
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("김도분", "01011112222"));
        send(sendData3);
        //sendData2.send()
    }
    // <>값안넣으면 Object
    // 제네릭의 와일드카드
    // void 대신 SendData<?> 가능
    // 와일드카드 상속 제한 Member거나 Member상속 받은 것 extends Member <-
    // super VipMember ->
    public static void send(SendData<? super VipMember> sendData) {
        sendData.send();
    }
}
