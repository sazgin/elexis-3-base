package at.medevit.elexis.outbox.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.graphics.Image;

import at.medevit.elexis.outbox.model.OutboxElement;
import at.medevit.elexis.outbox.model.OutboxElementType;
import at.medevit.elexis.outbox.ui.part.provider.IOutboxElementUiProvider;

public class DefaultOutboxElementLabelProvider implements IOutboxElementUiProvider {
	
	private DefaultLabelProvider labelProvider;
	
	public DefaultOutboxElementLabelProvider(){
		labelProvider = new DefaultLabelProvider();
	}

	
	@Override
	public ImageDescriptor getFilterImage(){
		return null; // TODO
	}
	
	@Override
	public ViewerFilter getFilter(){
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public LabelProvider getLabelProvider(){
		return labelProvider;
	}
	
	@Override
	public IColorProvider getColorProvider(){
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean isProviderFor(OutboxElement element){
		OutboxElementType elementType = OutboxElementType.parseType(element.getUri());
		return OutboxElementType.FILE.equals(elementType)
			|| OutboxElementType.DB.equals(elementType);
	}
	
	@Override
	public void doubleClicked(OutboxElement element){
		

	}
	
	class DefaultLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element){
			return ((OutboxElement) element).getLabel();
		}
		
		@Override
		public Image getImage(Object element){
			return null;
		}
	}
	
}
