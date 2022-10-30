// Generated by view binder compiler. Do not edit!
package com.example.safedrive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.safedrive.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDriveBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView ashwin;

  @NonNull
  public final Button gopal;

  private ActivityDriveBinding(@NonNull LinearLayout rootView, @NonNull TextView ashwin,
      @NonNull Button gopal) {
    this.rootView = rootView;
    this.ashwin = ashwin;
    this.gopal = gopal;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDriveBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDriveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_drive, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDriveBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ashwin;
      TextView ashwin = ViewBindings.findChildViewById(rootView, id);
      if (ashwin == null) {
        break missingId;
      }

      id = R.id.gopal;
      Button gopal = ViewBindings.findChildViewById(rootView, id);
      if (gopal == null) {
        break missingId;
      }

      return new ActivityDriveBinding((LinearLayout) rootView, ashwin, gopal);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
