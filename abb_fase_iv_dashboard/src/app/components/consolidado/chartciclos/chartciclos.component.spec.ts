import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChartciclosComponent } from './chartciclos.component';

describe('ChartciclosComponent', () => {
  let component: ChartciclosComponent;
  let fixture: ComponentFixture<ChartciclosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChartciclosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChartciclosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
