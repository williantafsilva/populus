package edu.umn.ecology.populus.visual;
import com.borland.jbcl.editors.IntegerTagEditor;

/** Use to define the direction the HTMLLabel will point.*/

public class DirectionEditor extends IntegerTagEditor {

   public DirectionEditor() {
      super( new int[] {
   HTMLLabel.NORMAL, HTMLLabel.DOWN_TO_UP, HTMLLabel.UPSIDEDOWN,
   HTMLLabel.UP_TO_DOWN
}, new String[] {
   "Normal", "Down to Up (90deg CC)", "Upside-Down", "Up to Down (270deg CC)"
}, new String[] {
   "HTMLLabel.NORMAL", "HTMLLabel.DOWN_TO_UP", "HTMLLabel.UPSIDEDOWN",
   "HTMLLabel.UP_TO_DOWN"
} );
   }
}
