// Generated code from Butter Knife. Do not modify!
package pdf.dudepdftools.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import ja.burhanrashid52.photoeditor.PhotoEditorView;
import java.lang.IllegalStateException;
import java.lang.Override;
import pdf.dudepdftools.R;

public class ImageEditor_ViewBinding implements Unbinder {
  private ImageEditor target;

  private View view7f0a0330;

  private View view7f0a02ec;

  private View view7f0a038d;

  private View view7f0a0353;

  @UiThread
  public ImageEditor_ViewBinding(ImageEditor target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ImageEditor_ViewBinding(final ImageEditor target, View source) {
    this.target = target;

    View view;
    target.imageCount = Utils.findRequiredViewAsType(source, R.id.imagecount, "field 'imageCount'", TextView.class);
    view = Utils.findRequiredView(source, R.id.previousImageButton, "field 'previousButton' and method 'previousImg'");
    target.previousButton = Utils.castView(view, R.id.previousImageButton, "field 'previousButton'", ImageView.class);
    view7f0a0330 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.previousImg();
      }
    });
    target.doodleSeekBar = Utils.findRequiredViewAsType(source, R.id.doodleSeekBar, "field 'doodleSeekBar'", SeekBar.class);
    target.photoEditorView = Utils.findRequiredViewAsType(source, R.id.photoEditorView, "field 'photoEditorView'", PhotoEditorView.class);
    target.brushColorsView = Utils.findRequiredViewAsType(source, R.id.doodle_colors, "field 'brushColorsView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.nextimageButton, "method 'nextImg'");
    view7f0a02ec = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.nextImg();
      }
    });
    view = Utils.findRequiredView(source, R.id.savecurrent, "method 'saveC'");
    view7f0a038d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.saveC();
      }
    });
    view = Utils.findRequiredView(source, R.id.resetCurrent, "method 'resetCurrent'");
    view7f0a0353 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.resetCurrent();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ImageEditor target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageCount = null;
    target.previousButton = null;
    target.doodleSeekBar = null;
    target.photoEditorView = null;
    target.brushColorsView = null;

    view7f0a0330.setOnClickListener(null);
    view7f0a0330 = null;
    view7f0a02ec.setOnClickListener(null);
    view7f0a02ec = null;
    view7f0a038d.setOnClickListener(null);
    view7f0a038d = null;
    view7f0a0353.setOnClickListener(null);
    view7f0a0353 = null;
  }
}
