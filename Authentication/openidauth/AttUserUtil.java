/**
 * 
 */
package openidauth;

/**
 * @author Anil Wakade
 *
 * @date Sep 4, 2017 2:33:58 PM
 */
public class AttUserUtil
{
  public static final ThreadLocal<String> threadUser = new ThreadLocal<String>();

  public static String getUserId()
  {
    return threadUser.get();
  }

  public static void setUserId(String userId)
  {
    threadUser.set(userId);
  }

  public static void removeUserId()
  {
    threadUser.remove();
  }
}