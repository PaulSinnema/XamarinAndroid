package md50957fcb84eeed84a25dd977f567294a0;


public class MenuItem
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ExpandableListDemo.MenuItem, ExpandableListDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MenuItem.class, __md_methods);
	}


	public MenuItem () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MenuItem.class)
			mono.android.TypeManager.Activate ("ExpandableListDemo.MenuItem, ExpandableListDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
