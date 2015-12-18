package md50957fcb84eeed84a25dd977f567294a0;


public class HeaderSubItemHolder
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ExpandableListDemo.HeaderSubItemHolder, ExpandableListDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", HeaderSubItemHolder.class, __md_methods);
	}


	public HeaderSubItemHolder () throws java.lang.Throwable
	{
		super ();
		if (getClass () == HeaderSubItemHolder.class)
			mono.android.TypeManager.Activate ("ExpandableListDemo.HeaderSubItemHolder, ExpandableListDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public HeaderSubItemHolder (android.widget.ImageView p0, android.widget.TextView p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == HeaderSubItemHolder.class)
			mono.android.TypeManager.Activate ("ExpandableListDemo.HeaderSubItemHolder, ExpandableListDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Widget.ImageView, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Widget.TextView, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
