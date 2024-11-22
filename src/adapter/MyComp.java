package adapter;

public class MyComp {

    private USB usb;

    public void setUsb(USB usb){
        this.usb = usb;
    }

    public void workWithUsb () {
        if (usb != null) {
            usb.usbConnect();
        }
    }
}
