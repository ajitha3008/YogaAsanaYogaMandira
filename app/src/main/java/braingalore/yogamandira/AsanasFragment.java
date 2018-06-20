package braingalore.yogamandira;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by s92 on 5/4/2017.
 */

public class AsanasFragment extends Fragment {

    String about = "Asanas";

    private WebView aboutView;

    String htmlText = " %s ";

    Context context;

    View fullView;

    TextView headingView;

    ScrollView scrollView;

    public View onCreateView(LayoutInflater inflater, ViewGroup vg,
                             Bundle savedInstanceState) {
        fullView = inflater.inflate(R.layout.content_about, vg, false);
        scrollView = (ScrollView) fullView.findViewById(R.id.scroll_view);
        context = getActivity();
        aboutView = (WebView) fullView.findViewById(R.id.webView_about);
        headingView = (TextView) fullView.findViewById(R.id.dhyana_text_view);
        aboutView.loadData(String.format(htmlText, about), "text/html", "utf-8");
        return fullView;
    }
}