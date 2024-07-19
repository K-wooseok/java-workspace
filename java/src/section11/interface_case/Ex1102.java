package section11.interface_case;

public class Ex1102 {
    public static void main(String[] args) {
        SamsungTV samsungTV = new SamsungTV();
        samsungTV.userGuide();
        samsungTV.turnOn();
        samsungTV.fold();
        samsungTV.setVolume(120);
        System.out.println("Samsung Tv Volume: " + samsungTV.getVolume());
        samsungTV.unfold();
        samsungTV.turnOff();

        LGTV lgTV = new LGTV();
        lgTV.turnOn();
        lgTV.rollUp();
        lgTV.setVolume(-120);
        System.out.println("LG Tv Volume: " + lgTV.getVolume());
        lgTV.turnOff();
        lgTV.rollDown();

        System.out.println();

        SamsungLGTV SamsungLGTV = new SamsungLGTV();
        SamsungLGTV.turnOn();
        SamsungLGTV.rollUp();
        SamsungLGTV.fold();
        SamsungLGTV.setVolume(-120);
        System.out.println("SamsungLG Tv Volume: " + SamsungLGTV.getVolume());
        SamsungLGTV.turnOff();
        SamsungLGTV.rollDown();
        SamsungLGTV.unfold();

        System.out.println();

        InnovationTV innovationTV = new InnovationTV();
        innovationTV.userGuide();
        innovationTV.turnOn();
        innovationTV.rollUp();
        innovationTV.fold();
        innovationTV.setVolume(-120);
        System.out.println("Innovation Tv Volume: " + innovationTV.getVolume());
        innovationTV.activeAI();
        innovationTV.deactiveAI();
        innovationTV.turnOff();
        innovationTV.rollDown();
        innovationTV.unfold();
    }
}
