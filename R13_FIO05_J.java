/* FIO05-J. Do not expose buffers or their backing arrays methods to untrusted code */

final class Wrap {
  private char[] dataArray;
 
  public Wrap() {
    dataArray = new char[10];
    // Initialize
  }
 
  public CharBuffer getBufferCopy() {
    return CharBuffer.wrap(dataArray);
  }
}