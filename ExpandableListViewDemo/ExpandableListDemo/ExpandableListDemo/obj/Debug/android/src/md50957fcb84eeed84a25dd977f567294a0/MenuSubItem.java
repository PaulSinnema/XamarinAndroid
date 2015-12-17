package md50957fcb84eeed84a25dd977f567294a0;


public class MenuSubItem
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ExpandableListDemo.MenuSubItem, ExpandableListDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MenuSubItem.class, __md_methods);
	}


	public MenuSubItem () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MenuSubItem.class)
			mono.android.TypeManager.Activate ("ExpandableListDemo.MenuSubItem, ExpandableListDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
