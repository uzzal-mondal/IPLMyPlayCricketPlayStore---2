package com.example.uzzal.ipl2019livemathschedulefixture;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LiveScoreActivity extends AppCompatActivity {

    private WebView webView;
    private SwipeRefreshLayout swipeReId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_score);

        // add to actionbar setting
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Live Score");


        webView = (WebView) findViewById(R.id.webView_id);

        class C02593 extends WebViewClient {
            C02593() {
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                LiveScoreActivity.this.webView.loadUrl("file:///android_asset/error.html");
            }

            public void onPageFinished(WebView webView, String str) {
                // LiveScoreActivity.this.swipeReId.setRefreshing(null);
            }

            class C03271 extends WebViewClient {
                C03271() {
                }

                public void onAdClosed() {
                    LiveScoreActivity.this.finish();
                }
            }
        }

        class C03282 implements SwipeRefreshLayout.OnRefreshListener {
            C03282() {
            }

            public void onRefresh() {

                // LiveScoreActivity.this.LoadWeb();
            }
        }


//        protected void onCreate(Bundle bundle) {
//                super.onCreate(bundle);
//                getSupportActionBar().setDisplayShowHomeEnabled(true);
//                getSupportActionBar().setLogo((int) C0265R.drawable.ic_launcher_round);
//                getSupportActionBar().setDisplayUseLogoEnabled(true);
//                setContentView((int) C0265R.layout.activity_live);
//                this.mAdView = (AdView) findViewById(C0265R.id.adView);
//                this.mAdView.loadAd(new Builder().build());
//                this.mInterstitialAd = new InterstitialAd(this);
//                this.mInterstitialAd.setAdUnitId(getString(C0265R.string.interstitial_ad_unit_id));
//                this.mInterstitialAd.loadAd(new Builder().build());
//                this.mInterstitialAd.setAdListener(new C03271());
//                this.swipeReId = (SwipeRefreshLayout) findViewById(C0265R.id.swipeReId);
//                this.swipeReId.setOnRefreshListener(new C03282());
//                LoadWeb();



        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        this.webView.setWebViewClient(new C02593());

        webView.loadUrl("http://www.cricwaves.com/cricket/widgets/script/scoreWidgets.js%22%3E%3C/script%3E");



    }
}
