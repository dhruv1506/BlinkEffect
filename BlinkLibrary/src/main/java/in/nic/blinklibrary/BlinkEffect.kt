package  `in`.nic.blinklibrary

import android.animation.Animator
import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.graphics.Color
import android.view.View
import android.view.animation.Animation

object BlinkEffect {

    fun blin(view: View)
    {
            val animator: ObjectAnimator=ObjectAnimator.ofInt(

                view ,"backgroundColor",Color.YELLOW,
                Color.RED,Color.GREEN
            )
            animator.duration=500
            animator.setEvaluator(ArgbEvaluator())
            animator.repeatCount=Animation.REVERSE
            animator.repeatCount=Animation.INFINITE
            animator.start()
            print("")








    }
}