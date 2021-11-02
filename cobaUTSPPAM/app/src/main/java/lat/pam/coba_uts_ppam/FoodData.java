package lat.pam.coba_uts_ppam;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context){
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor","Terbuat dari tahu yang dilembutkan lalu diisi dengan adonan berbahan ikan dan ditambah bumbu kacang, makanan ini paling enak disantap hangat di siang hari atau sore hari. ",5000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Cappuccino","Perpaduan kopi hitam, susu, dan krim yang seimbang membuat minuman ini populer untuk kalangan muda, cocok untuk dinikmati kapanpun.", 12000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake","Hidangan ringan ini cocok untuk dessert",7000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Black Salad","Hidangan sehat ini cocok bagi yang ingin diet carbo",10000,context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Donut","Camilan populer ini hadir dengan berbagai macam toping mulai dari cokelat hingga kacang.",9000,context.getDrawable(R.drawable.donut)));
        list.add(new Food("Mie Goreng","Bukan indomie, atau mie kemasan lain ",10000,context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Sparkling Tea","Cocok untuk yang ingin minuman bersoda namun rendah gula",8000,context.getDrawable(R.drawable.sparkling_tea)));
        list.add(new Food("Cireng","deskripsi cireng",5000,context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Nasi Goreng","Makanan populer ini cocok disantap kapapun, dengan pilihan porsi anda tidak perlu khawatir tidak kenyang atau kelebihan. ",15000,context.getDrawable(R.drawable.nasigoreng)));
        return list;
    }
}
