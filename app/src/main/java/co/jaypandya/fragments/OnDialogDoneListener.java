package co.jaypandya.fragments;

/**
 * Created by Jay on 2/10/2016.
 */
/*
 * An interface implemented typically by an activity
 * so that a dialog can report back
 * on what happened.
 */
public interface OnDialogDoneListener {
    public void onDialogDone(String tag, boolean cancelled, CharSequence message);
}