package kr.hs.e_mirim.s2019s04.mirimgallery;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GalleryAdapter extends BaseAdapter {
    int[] imgRes = {R.drawable.poster1, R.drawable.poster2, R.drawable.poster3, R.drawable.poster4, R.drawable.poster5, R.drawable.poster6, R.drawable.poster7, R.drawable.poster8, R.drawable.poster9, R.drawable.poster10};
    Context context;

    String[]

    public GalleryAdapter(Context context) {
        this.context = context;
        this.imgvMain = imgvMain;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new Gallery.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5, 5, 5);
        imgv.setImageResource(imgRes[position]);
        final View toastView = View.inflate(context, R.layout.layout, null);
        final TextView textTitle = toastView.findViewById(R.id.text_title);

        final int pos = position;
        imgv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imgvMain.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imgvMain.setImageResource(imgRes[pos]);

                return false;
            }
        });

        return null;
    }
}
