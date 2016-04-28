package tongchengquwei.overflowdemo;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;

/**
 * Created by wuchu on 16/4/25.
 */
public class TestUtil {

    private static Animation alphaShowAnimation = null;
	private static Animation alphaHideAnimation = null;

    public static void startViewAnimation(final View view,boolean isShow, int time, Context context,final Object obj) {
//        Animation alphaShowAnimation = null;
//        Animation alphaHideAnimation = null;

        if (isShow) {
            if (alphaShowAnimation == null)
            {
                alphaShowAnimation = AnimationUtils.loadAnimation(context, R.anim.animation_show);
                alphaShowAnimation.setAnimationListener(new AnimationListener() {

                    @Override
                    public void onAnimationStart(Animation arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onAnimationRepeat(Animation arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onAnimationEnd(Animation arg0) {
                        // TODO Auto-generated method stub
                       // view.clearAnimation();

                        obj.hashCode();
                    }
                });
            }
//            alphaShowAnimation.setDuration(time);
//            view.setVisibility(View.VISIBLE);
//            view.startAnimation(alphaShowAnimation);
        } else {
            if (alphaHideAnimation == null) {
                alphaHideAnimation = AnimationUtils.loadAnimation(context, R.anim.animation_hide);
            }
            alphaHideAnimation.setAnimationListener(new AnimationListener() {

                @Override
                public void onAnimationStart(Animation arg0) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onAnimationRepeat(Animation arg0) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onAnimationEnd(Animation arg0) {
                    // TODO Auto-generated method stub
                    //view.setVisibility(View.GONE);
                }
            });
            alphaHideAnimation.setDuration(time);
            view.startAnimation(alphaHideAnimation);
        }
    }

    public static void startViewAnimation(final View view, final boolean isShow, Context context,final Object obj) {
        startViewAnimation(view, isShow, 300, context,obj);
    }
}
