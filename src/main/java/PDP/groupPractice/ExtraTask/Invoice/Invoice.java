package PDP.groupPractice.ExtraTask.Invoice;

/*Invoice.
    Quyidagi attributelardan iborat Invoice klassini encapsulation prinsipi asosida yarating:
    (string) invoiceNumber, (int) cost, (boolean) status, (String) paidBy.   Bunda "invoiceNumber" invoice nomeri,
    "cost"qancha to'lash kerakligi, "status" to'lov xolati, "paidBy" kim to'lagani. */

/*  Dastur ishga tushganda 5 ta invoice kontstruktor yordamida yaratib olinadi. Keyin to'lov amalga
    oshiradigan foydalanuvchi ma'lumotlari kiritiladi: ism, familiya. Keyin qaysi invoicega to'lov
    qilishni invoice nomerini kiritish orqali yozadi, bunday invoice bo'lsa  ma'lumoti chiqarilib va
    qancha to'lov qilishi kerakligi so'raladi; To'langan summa costdan ayirib qo'yilib, agar to'lov
    to'liq to'lanib bo'lsa status xolatini o'zgaritib qo'yiladi, kim tomonidan to'langaniga foydalanuvchi
    kiritgan ismni yozib qo'yadi. Operatsiyalar shu tartibda davom etadi.*/

public class Invoice {
    String invoiceNumber;  // invoice nomeri
    int cost;              // cost qancha to'lash kerakligi
    boolean status;        // status to'lov xolati
    String paidBy;         // paidBy kim to'lagani

    public Invoice(String invoiceNumber, int cost) {
        this.invoiceNumber = invoiceNumber;
        this.cost = cost;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if(this.cost<cost&&isStatus()){
            System.out.println("to'lov miqdorini to'gri kriting!");
        }else{
            this.cost = this.cost - cost;
        }
        if (!(isStatus())) {
            System.out.println("invoice ga to'lov to'liq amalga oshirilgan");
        }else if(this.cost == 0){
            this.status=false;
            System.out.println("miqdor to'liq qoplandi");
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy;
    }

    @Override
    public String toString() {
        return "invoice haqida ma'lumot {" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", cost=$" + cost +
                ", status=" + status +
                ", paidBy='" + paidBy + '\'' +
                '}';
    }
}
